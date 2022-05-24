package org.example;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MinMaxMapper extends Mapper <LongWritable,Text, Text,LongWritable>{
    private final Text keyText = new Text("K");
    private LongWritable val = new LongWritable(0);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        val.set(Long.parseLong(value.toString()));
        context.write(keyText, val);
    }
}
