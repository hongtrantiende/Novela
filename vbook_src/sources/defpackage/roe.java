package defpackage;

import java.util.Comparator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: roe  reason: default package */
/* loaded from: classes.dex */
public final class roe implements Comparator {
    public static final roe a;
    public static final /* synthetic */ roe[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, roe] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new roe[]{r0};
    }

    public static roe[] values() {
        return (roe[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
