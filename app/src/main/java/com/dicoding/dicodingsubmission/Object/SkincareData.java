package com.dicoding.dicodingsubmission.Object;

import java.util.ArrayList;

public class SkincareData {
    public static String[][] data = new String[][]{
            {"MENTHA TROUBLE FOAM", "Rp. 188,000",  "150ML", "Cool, soothe and repair troubled skin with Hanyul's Mentha Trouble Foam! This refreshing cleanser lathers up into a fine foam that clarifies and is infused with BHA and peppermint extract picked from Hallyu mountain to deep cleanse the skin, whisking away impurities, dirt and sebum from deep within the pores. You'll be left with a clean, fresh complexion that's ready to take on the rest on your skincare routine!" , "https://images-na.ssl-images-amazon.com/images/I/31CbCeAofTL.jpg", "5"},
            {"JEJU CHERRY BLOSSOM SKIN", "Rp. 201,000", "200ML", "Water, Propanediol, Nicotinamide, Glycerol, Betaine, 1,2-Hexanediol, PPG-13-Decyltetradeceth-24, Octyldodeceth-16, Capric/Caprylic Triglycerides, Glyceryl caprylate, Edetate Disodium, Ethylhexylglycerin, Parfum, Prunus Yedoensis, Tocopherol", "https://kbeautymart.com/1297-large_default/innisfree-jeju-cherry-blossom-tone-up-cream-50ml.jpg","4"},
            {"ROSE WATER MIST", "Rp. 276,000", "120ML", "Roses are red, violets are blue. 100% Damask rose water, could it be true? With Mamonde's Rose Water Mist, that's exactly what you get! This bottle is filled with a specially distilled brew of rose water to soothe, hydrate and leave the skin feeling dewy. Use this as a toner, a face mist or even to set your makeup as you go about your day!", "https://cdn.shopify.com/s/files/1/1087/6326/products/aster-and-bay-rosewater-mist-z_1024x1024.jpg?v=1466442378", "5"},
            {"SEOYANG TANGGUK BLACK COFFEE", "Rp. 150,000", "10STICKS", "What if we told you that just a cup or two of coffee everyday could help keep you slim and feeling great? These black coffee formulas are made with green coffee bean extract and L-Carnitine to help reduce body fat. The beans come in a premium dark roast and contain no sugar for a robust, delicious taste. Try these out for yourself today!", "https://d1gnt0aflnpn8l.cloudfront.net/wysiwyg/Sub-Banner-Slider/0519-Inssatem-SeoyangTanggukBlackCoffee-subbanner.jpg", "4"},
            {"INK SKINNY EYELINER", "Rp. 75,000", "0.3G", "Nothing beats a perfectly lined eye to bring attention and definition to your look! Peri Pera’s Ink Skinny Eyeliners are the perfect way to add a little something extra to your look, gliding effortlessly onto the eyes to lift and open your eyes. They come with a fine 3mm tip for precise application, and have a waterproof formula that sets down and lasts all day. Pick from 5 gorgeous shades to suit your mood!", "https://d1gnt0aflnpn8l.cloudfront.net/catalog/product/cache/image/beff4985b56e3afdbeabfc89641a4582/0/4/0419-peripera-inkskinnyeyeliner-thumbnail.jpg", "5"},
            {"REAL FLORAL AIR CREAM CALENDULA", "Rp. 275,000", "100ML", "Calendula is a flower with powerful soothing and moisturizing properties. This lightweight, non-sticky cream is infused with the good stuff to deliver a boost of hydration to the skin, revitalizing dull complexions and calming irritations. Pair it with the Real Calendula Floral Toner for twice the goodness!", "https://cdn.shopify.com/s/files/1/0800/9883/products/aircream1_2160x2160.jpg?v=1542918296", "5"},
            {"24/7 POWDER FIXER", "Rp. 76,000", "10G", "Fix make up to prevent falling from sweat and water, Sebum absorption powder control sebum and moisture essence gives hydration, Light particle powder give clear looking skin", "https://www.misshaus.com/pub/media/catalog/product/cache/3fba745dcec88e97bfe808bedc471260/a/p/apap1009_apieu_247_powder_fixer.jpg", "5"},
            {"ROSE QUARTZ FACE ROLLER", "Rp. 299,000", "1pcs", "Treat your skin right with the luxury it deserves! Jardin's Rose Quartz Crystal Face Roller is a dual-ended face massager that's made from 100% natural Brazilian gemstone. It helps to improve blood circulation, encouraging collagen synthesis while simultaneously soothing the skin with a cool sensation. Use with your favorite skincare product, and your complexion will be left feeling plump, relaxed and smooth.", "https://cdn.shopify.com/s/files/1/0002/8131/3308/products/7785_0039_Amazon_NEW_1024x1024@2x.jpg?v=1522869420", "5"},
            {"GALACTOMYCES PURE VITAMIN C GLOW TONER", "Rp. 251,000", "200ML", "Two is better than one with Some By Mi's Galactomyces Pure Vitamin C Glow Toner! This nourishing toner contains galactomyces ferment to firm up and reduce fine lines, as well as vitamin C to brighten dullness and dark spots. It also has a moisturizing mix of plant based ingredients that adds a radiant glow to the complexion, leaving it bright and bouncy to the touch!", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/1/31/15954816/15954816_91148181-935e-48c0-b374-6d48aeb79396_1029_1029.jpg", "5"}
    };

    public static ArrayList<Skincare> getListData(){
        Skincare skincare = null;
        ArrayList<Skincare> list = new ArrayList<>();
        for (String[] aData : data) {
            skincare = new Skincare();
            skincare.setName(aData[0]);
            skincare.setPrice(aData[1]);
            skincare.setQuantity(aData[2]);
            skincare.setDesc(aData[3]);
            skincare.setImage(aData[4]);
            skincare.setRating(Integer.parseInt(aData[5]));
            list.add(skincare);
        }

        return list;
    }
}
