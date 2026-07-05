package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn9  reason: default package */
/* loaded from: classes3.dex */
public final class zn9 {
    public static final zn9 a;
    public static final zn9 b;
    public static final /* synthetic */ zn9[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zn9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zn9] */
    static {
        ?? r0 = new Enum("Loading", 0);
        a = r0;
        ?? r1 = new Enum("Success", 1);
        b = r1;
        c = new zn9[]{r0, r1};
    }

    public static zn9 valueOf(String str) {
        return (zn9) Enum.valueOf(zn9.class, str);
    }

    public static zn9[] values() {
        return (zn9[]) c.clone();
    }
}
