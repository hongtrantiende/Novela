package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cse  reason: default package */
/* loaded from: classes.dex */
public abstract class cse implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static cse d(byte... bArr) {
        bArr.getClass();
        kse kseVar = new kse(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return cbe.z(kseVar);
        } finally {
            try {
                kseVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final cse b(Class cls) {
        if (cls.isInstance(this)) {
            return (cse) cls.cast(this);
        }
        throw new Exception(eub.p("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
