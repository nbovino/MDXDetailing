package com.example.nate.mdxdetailing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.String;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private String mService;
    public static final String TAG = MainActivity.class.getSimpleName();
    private Service[] mInteriorService = Service.getInteriorServices();
    private Service[] mExteriorService = Service.getExteriorServices();
    private Service[] mUltimateItems = Service.getUltimateItems();
    private Service[] mRestorationServices = Service.getRestorationServices();

    public static final String SERVICE = "CHOSEN_SERVICE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.interiorService)
    public void interiorToast() {
        setChoiceToNothing();
        mService = "Interior Services";
        Intent intent = new Intent(this, ShowServicesActivity.class);
        intent.putExtra("service", mService);
        intent.putExtra(SERVICE, mInteriorService);
        startActivity(intent);

    }

    @OnClick (R.id.exteriorService)
    public void exteriorToast() {
        setChoiceToNothing();
        mService = "Exterior Services";
        Intent intent = new Intent(this, ShowServicesActivity.class);
        intent.putExtra("service", mService);
        intent.putExtra(SERVICE, mExteriorService);
        startActivity(intent);
    }

    @OnClick (R.id.ultimateItems)
    public void ultimateToast() {
        setChoiceToNothing();
        mService = "Ultimate Items";
        Intent intent = new Intent(this, ShowServicesActivity.class);
        intent.putExtra("service", mService);
        intent.putExtra(SERVICE, mUltimateItems);
        startActivity(intent);
    }

    @OnClick (R.id.restorationServices)
    public void restorationToast() {
        setChoiceToNothing();
        mService = "Restoration Services";
        Intent intent = new Intent(this, ShowServicesActivity.class);
        intent.putExtra("service", mService);
        intent.putExtra(SERVICE, mRestorationServices);
        startActivity(intent);
    }

    public void setChoiceToNothing() {
        mService= "";
    }

//    private Service[] getInteriorServices() {
//
//        Service[] allInteriorServices = new Service[3];
//
//        Service expressInterior = new Service();
//        expressInterior.setTypeOfService("Express Interior");
//        expressInterior.setShortDescription("Fast, Convenient, Anywhere, Anytime!");
//        expressInterior.setDescription("The Express Interior is a basic vacuum and dust detail. Light interior cleaning for well maintained cars. Designed so you can always enjoy a perfectly clean interior. Have your vehicle detailed weekly while you're at work, shopping, or at the country club. Can be performed in parking garages and lots, even your apartment complex. 100% Eco Fiendly! Heavily soiled vehicles need not apply.\n" +
//                "Vacuum floors and upholstery of loose debris.\n" +
//                "Dash, door panels, consoles, and cupholders wiped down.\n" +
//                "Door jambs cleaned.\n" +
//                "Glass cleaned inside and out.");
//        allInteriorServices[0] = expressInterior;
//
//        Service deluxeInterior = new Service();
//        deluxeInterior.setTypeOfService("Deluxe Interior");
//        deluxeInterior.setShortDescription("Up-Keep For Vehicles Not Needing Premium Service. Recommended Monthly.");
//        deluxeInterior.setDescription("The most effective way to keep your interior in new condition is basic monthly maintenance. \u200BMeticulous vacuuming of carpets, seats, and seams, along with steam cleaning of hard surfaces. Removes debris and light dirt. Glass cleaned inside and out keeps driver's vision clear and safe.\n" +
//                "Thorough Vacuuming of carpets and upholstery.\n" +
//                "Steam Cleaning of dash, vents, cupholders, panels,  gauges, and steering controls, all hard surfaces.\n" +
//                "Windows and Mirrors cleaned Streak Free inside and out. Tint Safe.\n" +
//                "Door Jambs, Sills, and weatherstrips cleaned and dried.\u200B\n" +
//                "Add-on services: Leather Conditioning and UV Protection\n" +
//                "                           Steam Clean Carpets and Upholstery");
//        allInteriorServices[1] = deluxeInterior;
//
//        Service premiumInterior = new Service();
//        premiumInterior.setTypeOfService("Deluxe Interior");
//        premiumInterior.setShortDescription("Deep Clean and Protect. BEST DEAL! For New Customers or Every 6-12 Months");
//        premiumInterior.setDescription("Get's the dirt deep below the carpet and upholstery surfaces. Steam cleaning of all hard surfaces, seems, and trim. Leather and stitching is deeply cleaned, and conditioned. Includes a purifying air freshener along with carpet and fabric guardian protector application. Your interior will look, feel, and smell like new, while guardian protects it.\n" +
//                "\u200BBasic Service Plus The Following\n" +
//                "FREE Trim Conditioner with UV protection.\n" +
//                "FREE Carpet Guardian Protection.\n" +
//                "FREE Fabric Guardian Protection and/or\n" +
//                "FREE Leather Conditioner with UV Protection.\n" +
//                "Steam Cleaning of All Hard Surfaces, Seams, and Trim.\n" +
//                "Deep Carpet Cleaning Extracts Dirt and Grime.\n" +
//                "Deep Upholstery Cleaning Extracts Dirt and Grime.\n" +
//                "Leather Upholstery, Seams, and Stitching deeply cleaned, and conditioned. Includes UV protection.\u200B\u200B");
//        allInteriorServices[2] = premiumInterior;
//
//        Log.d(TAG, "Interior Services Populated with info");
//        return allInteriorServices;
//    }
//
//    private Service[] getExteriorServices() {
//
//        Service[] allExteriorServices = new Service[2];
//
//        Service expressExterior = new Service();
//        expressExterior.setTypeOfService("Deluxe Exterior");
//        expressExterior.setShortDescription("Hand Wash 'n' Sealant");
//        expressExterior.setDescription("Detailed hand wash and paint Sealant Application. Recommended Monthly.\n" +
//                "\n" +
//                "\u200B\u200B\u200BFoam Presoak to loosen and dissolve dirt and grime.\n" +
//                "Meticulous 2 bucket hand wash to gently remove dirt.\n" +
//                "Bugs and road grime removed.\n" +
//                "Clean and dress tires, wheel wells, and trim.\n" +
//                "Clean wheel face, barrels, calipers, and exhaust tips of grime and brake dust.\n" +
//                "Vehicle gently dried while all water is blown from seams and crevices.\n" +
//                "Door jambs washed.\n" +
//                "Hydro-Seal Application Shines and Protects All Exterior Surfaces up to 3 months.\u200B");
//        allExteriorServices[0] = expressExterior;
//
//        Service deluxeExterior = new Service();
//        deluxeExterior.setTypeOfService("Premium Exterior");
//        deluxeExterior.setShortDescription("Cleanse, Polish, Protect");
//        deluxeExterior.setDescription("Deep cleanse paintwork, clay bar, polish, and seal. Recommended Yearly.\n" +
//                "Basic services plus the following\n" +
//                "\n" +
//                "Premium Trim sealant, Wheel sealant, and tire dressing.\n" +
//                "Clay Bar paint treatment. Removes bonded contaminants a wash alone cannot. (a key step to fix rough feeling paint)\n" +
//                "Paint Decon. Removes brake dust and iron pollution embedded in clear coat.\n" +
//                "Deep Cleanse paint to remove embedded grime and stains absorbed into clearcoat. (Iron staining, carbon exhaust buildup)\n" +
//                "High Gloss Polishing removes minor scratches, swirls, water spots, and other light imperfections.\n" +
//                "HydroSeal+PLUS  for slick, glossy, wet looking paint and up to 6 months of protection.");
//        allExteriorServices[1] = deluxeExterior;
//
//        Log.d(TAG, "Exterior Services Populated with info");
//        return allExteriorServices;
//    }
//
//    private Service[] getUltimateItems() {
//        Service[] allUltimateItems = new Service[3];
//
//        Service tireDressing = new Service();
//        tireDressing.setTypeOfService("Ultimate Tire Dressing");
//        tireDressing.setShortDescription("The Once a Year Tire Shine");
//        tireDressing.setDescription("Keeping tires clean, dark black, and glossy can be one of the dirtiest jobs a car owner faces. Over the counter dressings don't last, collect dirt, and sling, while most can actually dry rot tires and cause them to turn brown faster. \n" +
//                "Ultimate Tire Dressing is just what it sounds like, a tire dressing that gives ultimate looks, UV protection, and prevents browning with no sling guaranteed. The best part is that this dressing is extremely durable. It will not wash off and does not require scrubbing to clean tires. An intense cleaning session removes every last trace of old dressing and dirt to ensure optimal bonding. This cleaning is followed by the dressing application. A minimum of 3 coats is applied, more can be applied for those who want a glossier look. The results are tires that always look freshly detailed!");
//        allUltimateItems[0] = tireDressing;
//
//        Service glassSealant = new Service();
//        glassSealant.setTypeOfService("Ultimate Glass Sealant");
//        glassSealant.setShortDescription("You Won't Believe Your Eyes");
//        glassSealant.setDescription("\u200BUltimate Glass Sealant's benefits and savings are clear while driving and while your vehicle is parked. How? First, Ultimate Glass Sealant makes it easy to clear ice, snow, frost, and dirt  from your vehicle's glass when you start your day. It even helps prevent frost build up! Second, while driving, Rain water flies off, road grime doesn't stick, and dangerous headlight glare is eliminated, to greatly improve driver visibility and safety, day and night! Third, you'll use less washer fluid, your wiper blades will last longer, and wiper chatter is fixed. This service includes deep cleaning and light polishing of glass to ensure optimal bonding.\n" +
//                "What's more, is that It completely bonds to vehicle glass for 6 Months! ");
//        allUltimateItems[1] = glassSealant;
//
//        Service ultimatePaintCoating = new Service();
//        ultimatePaintCoating.setTypeOfService("Hydro + Ultimate Paint Coating");
//        ultimatePaintCoating.setShortDescription("2 Years Protection. Customer Favorite!");
//        ultimatePaintCoating.setDescription("\u200BIf you want the best gloss and the best protection, then you want Hydro+Ultimate Ceramic Paint Coating! The nanotechnology behind Hydro+Ultimate allows it to bond to painted surfaces at the molecular level and thus becoming a part of the vehicle. This extremely hydrophobic coating creates a hard glass-like surface to protect your vehicle from weathering, UV damage, environmental contaminants, wash-marring, and abrasion for up to 2 years, all while creating an easily washable surface that almost cleans itself.\n" +
//                "Silica-Quartz nanotechnology\n" +
//                "Ultimate in beauty and gloss\n" +
//                "Unmatched protection designed for winter climates\n" +
//                "\u200BExtremely Durable, Up to 2 Years!\u200B\u200B");
//        allUltimateItems[2] = ultimatePaintCoating;
//
//        Log.d(TAG, "Exterior Services Populated with info");
//        return allUltimateItems;
//    }
//
//    private Service[] getRestorationServices() {
//        Service[] allRestorationServices = new Service[3];
//
//        Service headlightRestoration = new Service();
//        headlightRestoration.setTypeOfService("Ultimate Tire Dressing");
//        headlightRestoration.setShortDescription("Restoration does not require removal of headlights, so there is no need to pay for expensive realignment!");
//        headlightRestoration.setDescription("Tired of old, foggy, yellow, headlights? Trouble seeing at night? Let MDX Detailing restore them back to new! For a small fraction of the cost of replacements, MDX will remove oxidation, restore clarity, and preserve your headlights with a Protective UV Resistant Coating that will protect from harsh UV rays, which is the cause of headlight yellowing and clouding. *PLUS* MDX guarantees restored headlights from future fading for 1 full year.");
//        allRestorationServices[0] = headlightRestoration;
//
//        Service trimRestoration = new Service();
//        trimRestoration.setTypeOfService("Trim Restoration");
//        trimRestoration.setShortDescription("");
//        trimRestoration.setDescription("Ultimate Glass Sealant's benefits and savings are clear while driving and while your vehicle is parked. How? First, Ultimate Glass Sealant makes it easy to clear ice, snow, frost, and dirt  from your vehicle's glass when you start your day. It even helps prevent frost build up! Second, while driving, Rain water flies off, road grime doesn't stick, and dangerous headlight glare is eliminated, to greatly improve driver visibility and safety, day and night! Third, you'll use less washer fluid, your wiper blades will last longer, and wiper chatter is fixed. This service includes deep cleaning and light polishing of glass to ensure optimal bonding.\n" +
//                "What's more, is that It completely bonds to vehicle glass for 6 Months!");
//        allRestorationServices[1] = trimRestoration;
//
//        Service paintRestoration = new Service();
//        paintRestoration.setTypeOfService("Paint Correction");
//        paintRestoration.setShortDescription("");
//        paintRestoration.setDescription("If your vehicle's paint has seen better days and is in need of heavy paint correction or if you are looking for a show car finish this is the package you need. This will fix scratches, marring, swirls, oxidation, water spots, acid rain damage, and orange peel. Using the best tools, and products, along with thorough prep work damaged paint is brought back to look better than new. Extreme care is taken along with proper technique to guarantee a high quality finish free of holograms or buffer trails. This is a 2 - 3 step cleaning, buffing, and polishing process with 6 to 16+ hours of labor involved.\u200B\n" +
//                "\n" +
//                "Paint Correction includes\n" +
//                "Gentle hand wash and dry\n" +
//                "Deep wheel cleaning\n" +
//                "Clay bar treatment\n" +
//                "Deep paint cleansing\n" +
//                "Prep Taping of delicate areas\n" +
//                "HydroSeal+Premium application\n" +
//                "Premium Trim Sealant\n" +
//                "Necessary buffing and polishing steps to achieve your desired results.");
//        allRestorationServices[2] = paintRestoration;
//
//        Log.d(TAG, "Exterior Services Populated with info");
//        return allRestorationServices;

}
