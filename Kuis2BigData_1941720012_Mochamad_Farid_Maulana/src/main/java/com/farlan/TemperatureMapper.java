package com.farlan;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;

public class TemperatureMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>
{
    private IntWritable temperatureWritable = new IntWritable(0);
    private Text cities = new Text();

    @Override
    public void map(LongWritable longWritable, Text text, OutputCollector<Text, IntWritable> outputCollector,
                    Reporter reporter) throws IOException
    {
        String data = text.toString();

        String[] split = data.split("-");
        String city = split[0].trim();
        String[] temperatureSplit = split[2].split(" ");
        String temperature = temperatureSplit[(temperatureSplit.length - 1)];

        this.cities.set(city);
        this.temperatureWritable.set(Integer.parseInt(temperature));
        outputCollector.collect(this.cities, this.temperatureWritable);
    }
}
