package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xp8  reason: default package */
/* loaded from: classes3.dex */
public final class xp8 {
    public static final xp8 a;
    public static final /* synthetic */ xp8[] b;
    public static final /* synthetic */ qu3 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xp8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SUCCESS", 0);
        a = r0;
        xp8[] xp8VarArr = {r0, new Enum("WRONG_PASSWORD", 1), new Enum("PDF_ERROR", 2), new Enum("LOADING_ERROR", 3), new Enum("UNKNOWN", 4)};
        b = xp8VarArr;
        c = new qu3(xp8VarArr);
    }

    public static xp8 valueOf(String str) {
        return (xp8) Enum.valueOf(xp8.class, str);
    }

    public static xp8[] values() {
        return (xp8[]) b.clone();
    }
}
