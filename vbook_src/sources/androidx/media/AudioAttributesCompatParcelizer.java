package androidx.media;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(h5d h5dVar) {
        ?? obj = new Object();
        j5d j5dVar = obj.a;
        if (h5dVar.e(1)) {
            j5dVar = h5dVar.h();
        }
        obj.a = (AudioAttributesImpl) j5dVar;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, h5d h5dVar) {
        h5dVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        h5dVar.i(1);
        h5dVar.l(audioAttributesImpl);
    }
}
