package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hpa  reason: default package */
/* loaded from: classes.dex */
public final class hpa {
    public static final hpa a;
    public static final hpa b;
    public static final /* synthetic */ hpa[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hpa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hpa] */
    static {
        ?? r0 = new Enum("THUMB", 0);
        a = r0;
        ?? r1 = new Enum("TRACK", 1);
        b = r1;
        c = new hpa[]{r0, r1};
    }

    public static hpa valueOf(String str) {
        return (hpa) Enum.valueOf(hpa.class, str);
    }

    public static hpa[] values() {
        return (hpa[]) c.clone();
    }
}
