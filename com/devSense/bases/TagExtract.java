package com.devSense.bases;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TagExtract {

    public static void main(String []args){

        Stream<String> myStream = tagsStream("<html lang=\"en-GB\"><head>\n" +
                "\t<meta name=\"robots\" content=\"index, follow, max-image-preview:large, max-snippet:-1, max-video-preview:-1\">\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<meta name=\"template\" content=\"Author 1.51\">\n" +
                "\n" +
                "\t<!-- This site is optimized with the Yoast SEO plugin v22.4 - https://yoast.com/wordpress/plugins/seo/ -->\n" +
                "\t<title>Reverse order a Stream in Java - Don't Panic!</title>\n" +
                "\t<meta name=\"description\" content=\"How do you reverse order a Stream in Java? There's no obvious Stream.reverse() method. Is this an oversight? Is there a workaround?\">\n" +
                "\t<link rel=\"canonical\" href=\"https://www.dontpanicblog.co.uk/2020/10/23/reverse-order-stream/\">\n" +
                "\t<meta property=\"og:locale\" content=\"en_GB\">\n" +
                "\t<meta property=\"og:type\" content=\"article\">\n" +
                "\t<meta property=\"og:title\" content=\"Reverse order a Stream in Java - Don't Panic!\">\n" +
                "\t<meta property=\"og:url\" content=\"https://www.dontpanicblog.co.uk/2020/10/23/reverse-order-stream/\">\n" +
                "\t<meta property=\"og:site_name\" content=\"Don't Panic!\">\n" +
                "\t<meta property=\"article:published_time\" content=\"2020-10-23T17:11:22+00:00\">\n" +
                "\t<meta property=\"article:modified_time\" content=\"2024-04-07T12:27:31+00:00\">\n" +
                "\t<meta name=\"author\" content=\"Stuart Leitch\">\n" +
                "\t<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "\t<meta name=\"twitter:label1\" content=\"Written by\">\n" +
                "\t<meta name=\"twitter:data1\" content=\"Stuart Leitch\">\n" +
                "\t<meta name=\"twitter:label2\" content=\"Estimated reading time\">\n" +
                "\t<meta name=\"twitter:data2\" content=\"3 minutes\">\n");

        System.out.println(myStream.collect(Collectors.toList()));

        List<Integer> list = Stream.of(1, 2, 3, 4)
                .collect(toReversedList());
        System.out.println(list); // Output will be [4, 3, 2, 1]


    }

    private static Stream<String> tagsStream(String tags){
        Matcher tagMatcher = Pattern.compile("<(\\w+).*?>").matcher(tags);
        return tagMatcher.results().map(result -> result.group(1));
    }

    private static <T> Collector<T, ?, List<T>> toReversedList(){
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list;
        });
    }
}
