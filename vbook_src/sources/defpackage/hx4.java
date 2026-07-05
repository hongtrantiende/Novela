package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx4  reason: default package */
/* loaded from: classes3.dex */
public final class hx4 {
    public static final hx4 a;
    public static final hx4 b;
    public static final hx4 c;
    public static final /* synthetic */ hx4[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hx4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hx4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hx4] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Brightness", 1);
        b = r1;
        ?? r2 = new Enum("Volume", 2);
        c = r2;
        d = new hx4[]{r0, r1, r2};
    }

    public static hx4 valueOf(String str) {
        return (hx4) Enum.valueOf(hx4.class, str);
    }

    public static hx4[] values() {
        return (hx4[]) d.clone();
    }
}
