public class Main {
    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("ArtGallery");

        Picture picture1 = new Picture("Mona Lisa", (short) 1503, "Leonardo da Vinci");
        Picture picture2 = new Picture("Starry Night", (short) 1889, "Vincent van Gogh");

        gallery.addPicture(picture1);
        gallery.addPicture(picture2);

        System.out.println("Gallery Name: " + gallery.getName());
        System.out.println("Picture Count: " + gallery.getPictureCount());

        for (Picture picture : gallery.getPictures()) {
            System.out.println(gallery.describePicture(picture));
        }

        gallery.removePicture(picture1);
        System.out.println("Picture Count after removal: " + gallery.getPictureCount());
    }
}