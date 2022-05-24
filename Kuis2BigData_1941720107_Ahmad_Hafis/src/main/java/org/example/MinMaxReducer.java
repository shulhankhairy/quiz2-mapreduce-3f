package org.example;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class MinMaxReducer extends Reducer <Text, LongWritable,Text,Text>{
    // Variabel max dan min
    private long max = Long.MIN_VALUE;
    private long min = Long.MAX_VALUE;

    @Override
    protected void reduce(Text key,Iterable<LongWritable> valueIn,Context context) throws IOException, InterruptedException {
        // melakukan looping untuk mendapatkan nilai max dan min
        for(LongWritable val : valueIn){
            long tmp = val.get();
            if(tmp > max){
                max = tmp;
            }
            if(tmp < min){
                min = tmp;
            }
        }
        // output nilai max dan min
        context.write(new Text("Max"),new Text(max + ""));
        context.write(new Text("Min"),new Text(min + ""));

    }
}
