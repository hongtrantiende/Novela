package defpackage;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: px8  reason: default package */
/* loaded from: classes3.dex */
public final class px8 extends e3 implements Serializable {
    public final SecureRandom c;

    public px8(SecureRandom secureRandom) {
        this.c = secureRandom;
    }

    @Override // defpackage.e3
    public final Random j() {
        return this.c;
    }
}
