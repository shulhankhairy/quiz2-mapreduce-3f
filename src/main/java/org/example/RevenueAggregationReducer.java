package org.example;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.util.Iterator;

public class RevenueAggregationReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>
{
    @Override
    public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output,
                       Reporter reporter) throws IOException
    {
        System.out.println("-----------------");
        System.out.println("Ini dari reducer");
        System.out.println("Key : " + key.toString());
        System.out.println("-----------------");

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(values.hasNext()) {
            IntWritable currentRevenue = values.next();
            System.out.println("Isi dari values saat ini : " + currentRevenue.get());
            sum += currentRevenue.get();
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
        }
        output.collect(key, new IntWritable(max));
        output.collect(key, new IntWritable(min));
    }

}
