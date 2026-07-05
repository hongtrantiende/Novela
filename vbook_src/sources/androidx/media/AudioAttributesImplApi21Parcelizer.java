package androidx.media;

import android.media.AudioAttributes;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(h5d h5dVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) h5dVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = h5dVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, h5d h5dVar) {
        h5dVar.getClass();
        h5dVar.k(audioAttributesImplApi21.a, 1);
        h5dVar.j(audioAttributesImplApi21.b, 2);
    }
}
