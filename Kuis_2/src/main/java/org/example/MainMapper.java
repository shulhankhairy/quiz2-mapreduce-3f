package org.example;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;

public class MainMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{
    private IntWritable revenueWritable = new IntWritable(0);
    private Text makananText = new Text();

    @Override
    public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
            throws IOException
    {
        String line = value.toString();

        System.out.println("Ini adalah daftar makanan");
        System.out.println(line);

        String[] split = line.split("-");
        String makanan = split[0];
        makanan = makanan.trim(); //Hilangkan spasi di depan/belakang

        String[] pendapatanSplit = split[1].split(" ");

        String pendapatan = pendapatanSplit[(pendapatanSplit.length-1)];

        this.makananText.set(makanan);
        this.revenueWritable.set(Integer.parseInt(pendapatan));
        output.collect(this.makananText, this.revenueWritable);
    }
}
