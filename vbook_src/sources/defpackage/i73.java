package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i73  reason: default package */
/* loaded from: classes.dex */
public final class i73 {
    public static final i73 a;
    public static final i73 b;
    public static final i73 c;
    public static final /* synthetic */ i73[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i73] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i73] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i73] */
    static {
        ?? r0 = new Enum("BEFORE", 0);
        a = r0;
        ?? r1 = new Enum("ON", 1);
        b = r1;
        ?? r2 = new Enum("AFTER", 2);
        c = r2;
        d = new i73[]{r0, r1, r2};
    }

    public static i73 valueOf(String str) {
        return (i73) Enum.valueOf(i73.class, str);
    }

    public static i73[] values() {
        return (i73[]) d.clone();
    }
}
