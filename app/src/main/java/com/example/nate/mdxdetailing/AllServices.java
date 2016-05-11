package com.example.nate.mdxdetailing;


import java.util.List;
import java.util.Map;

/**
 * Created by Nate on 5/8/16.
 */
public class AllServices {

    private String mServiceCategory;
    private List<String> mInteriorServicePackages;
    private List<String> mExteriorServicePackages;
    private List<String> mUltimateItems;
    private List<String> mRestorationServicePackages;

    public AllServices(String serviceCategory) {
        mServiceCategory = serviceCategory;
    }

    public AllServices() throws Exception {
        mInteriorServicePackages.add("Express Interior");
        mInteriorServicePackages.add("Deluxe Interior");
        mInteriorServicePackages.add("Premium Interior");
        Service mInteriorServices = new Service("Interior Service", mInteriorServicePackages);

        mExteriorServicePackages.add("Deluxe Exterior");
        mExteriorServicePackages.add("Premium Exterior");
        mExteriorServicePackages.add("Hydro+Ultimate Paint Coating");
        Service mExteriorServices = new Service("Exterior Service", mExteriorServicePackages);

        mUltimateItems.add("Ultimate Tire Dressing");
        mUltimateItems.add("Ultimate Glass Sealant");
        mUltimateItems.add("Hydro+Ultimate Paint Coating");
        Service mUltimateItemServices = new Service("Ultimate Items", mUltimateItems);

        mRestorationServicePackages.add("Headlight Restoration");
        mRestorationServicePackages.add("Trim Restoration");
        mRestorationServicePackages.add("Paint Correction");
        Service mRestorationServices = new Service("Restoration Services", mRestorationServicePackages);

    }

    public List<String> getInteriorServicePackages() {
        return mInteriorServicePackages;
    }

    public List<String> getExteriorServicePackages() {
        return mExteriorServicePackages;
    }

    public List<String> getRestorationServicePackages() {
        return mRestorationServicePackages;
    }

    public List<String> getUltimateItems() {
        return mUltimateItems;
    }

    public String getServiceCategory() {
        return mServiceCategory;
    }

//    public class SongBook {
//        private List<Song> mSongs;
//
//        public SongBook() {
//            mSongs = new ArrayList<Song>();
//        }
//
//        public void exportTo(String fileName) {
//            try (
//                    FileOutputStream fos = new FileOutputStream(fileName);
//                    PrintWriter writer = new PrintWriter(fos);
//            ) {
//                for (Song song : mSongs) {
//                    writer.printf("%s|%s|%s%n",
//                            song.getArtist(),
//                            song.getTitle(),
//                            song.getVideoUrl());
//
//                }
//            } catch (IOException ioe) {
//                System.out.printf("Problem saving %s %n", fileName);
//                ioe.printStackTrace();
//            }
//        }
//
//        public void importFrom(String fileName) {
//            try (
//                    FileInputStream fis = new FileInputStream(fileName);
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
//            ) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] args = line.split("\\|");
//                    addSong(new Song(args[0], args[1], args[2]));
//                }
//            } catch (IOException ioe) {
//                System.out.printf("Problems loading %s %n", fileName);
//                ioe.printStackTrace();
//            }
//        }
//
//        public void addSong(Song song) {
//            mSongs.add(song);
//        }
//
//        public int getSongCount() {
//            return mSongs.size();
//        }
//
//        // FIXME:  This should be cached!
//        private Map<String, List<Song>> byArtist() {
//            Map<String, List<Song>> byArtist = new TreeMap<>();
//            for (Song song : mSongs) {
//                List<Song> artistSongs = byArtist.get(song.getArtist());
//                if (artistSongs == null) {
//                    artistSongs = new ArrayList<>();
//                    byArtist.put(song.getArtist(), artistSongs);
//                }
//                artistSongs.add(song);
//            }
//            return byArtist;
//        }
//
//        public Set<String> getArtists() {
//            return byArtist().keySet();
//        }
//
//        public List<Song> getSongsForArtist(String artistName) {
//            List<Song> songs = byArtist().get(artistName);
//            songs.sort(new Comparator<Song>() {
//
//                @Override
//                public int compare(Song song1, Song song2) {
//                    if (song1.equals(song2)) {
//                        return 0;
//                    }
//                    return song1.mTitle.compareTo(song2.mTitle);
//                }
//            });
//            return songs;
//        }
}
