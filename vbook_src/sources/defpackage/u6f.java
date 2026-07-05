package defpackage;

import java.security.SecureRandom;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u6f  reason: default package */
/* loaded from: classes.dex */
public abstract class u6f {
    public static final ro a = new ro(8);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
