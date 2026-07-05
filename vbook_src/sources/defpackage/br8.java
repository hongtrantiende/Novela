package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br8  reason: default package */
/* loaded from: classes3.dex */
public final class br8 {
    public static final br8 a;
    public static final br8 b;
    public static final br8 c;
    public static final /* synthetic */ br8[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, br8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, br8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, br8] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("End", 1);
        b = r1;
        ?? r2 = new Enum("None", 2);
        c = r2;
        d = new br8[]{r0, r1, r2};
    }

    public static br8 valueOf(String str) {
        return (br8) Enum.valueOf(br8.class, str);
    }

    public static br8[] values() {
        return (br8[]) d.clone();
    }
}
