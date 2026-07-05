package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ma6  reason: default package */
/* loaded from: classes3.dex */
public final class ma6 {
    public static final ma6 a;
    public static final ma6 b;
    public static final ma6 c;
    public static final ma6 d;
    public static final ma6 e;
    public static final /* synthetic */ ma6[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [ma6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ma6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ma6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ma6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ma6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ma6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BEFORE_START", 0);
        a = r0;
        ?? r1 = new Enum("START_DOC", 1);
        b = r1;
        ?? r2 = new Enum("DOCTYPE_DECL", 2);
        ?? r3 = new Enum("BODY", 3);
        c = r3;
        ?? r4 = new Enum("POST", 4);
        d = r4;
        ?? r5 = new Enum("EOF", 5);
        e = r5;
        f = new ma6[]{r0, r1, r2, r3, r4, r5};
    }

    public static ma6 valueOf(String str) {
        return (ma6) Enum.valueOf(ma6.class, str);
    }

    public static ma6[] values() {
        return (ma6[]) f.clone();
    }
}
