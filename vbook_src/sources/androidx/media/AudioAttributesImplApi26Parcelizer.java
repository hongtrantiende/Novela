package androidx.media;

import android.media.AudioAttributes;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    public static AudioAttributesImplApi26 read(h5d h5dVar) {
        ?? audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) h5dVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = h5dVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, h5d h5dVar) {
        h5dVar.getClass();
        h5dVar.k(audioAttributesImplApi26.a, 1);
        h5dVar.j(audioAttributesImplApi26.b, 2);
    }
}
