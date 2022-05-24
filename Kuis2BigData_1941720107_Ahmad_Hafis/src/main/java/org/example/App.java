package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Configuration conf = new Configuration();
        //1、 get job object
        Job job = Job.getInstance(conf);
        //2、 set the main class
        job.setJarByClass(App.class);
        //3、 set job parameters
        job.setMapperClass(MinMaxMapper.class);
        job.setReducerClass(MinMaxReducer.class);
        //4 set map reduce output type
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);
        //5、 set job input and output
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        //6 commit job
        boolean success = job.waitForCompletion(true);
        System.exit(success ? 0 : 1);
    }
}
