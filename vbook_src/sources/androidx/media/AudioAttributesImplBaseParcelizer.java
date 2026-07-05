package androidx.media;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media.AudioAttributesImplBase, java.lang.Object] */
    public static AudioAttributesImplBase read(h5d h5dVar) {
        ?? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.c = 0;
        obj.d = -1;
        obj.a = h5dVar.f(0, 1);
        obj.b = h5dVar.f(obj.b, 2);
        obj.c = h5dVar.f(obj.c, 3);
        obj.d = h5dVar.f(obj.d, 4);
        return obj;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, h5d h5dVar) {
        h5dVar.getClass();
        h5dVar.j(audioAttributesImplBase.a, 1);
        h5dVar.j(audioAttributesImplBase.b, 2);
        h5dVar.j(audioAttributesImplBase.c, 3);
        h5dVar.j(audioAttributesImplBase.d, 4);
    }
}
