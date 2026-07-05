package defpackage;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m40  reason: default package */
/* loaded from: classes.dex */
public final class m40 extends fz4 {
    @Override // defpackage.fz4
    public final AudioAttributesImpl c() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.a).build());
    }

    @Override // defpackage.fz4
    public final fz4 p0() {
        ((AudioAttributes.Builder) this.a).setUsage(1);
        return this;
    }

    @Override // defpackage.fz4
    public final fz4 q0() {
        ((AudioAttributes.Builder) this.a).setUsage(1);
        return this;
    }
}
