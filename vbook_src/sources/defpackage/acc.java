package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: acc  reason: default package */
/* loaded from: classes.dex */
public final class acc {
    public static final acc C;
    public static final /* synthetic */ acc[] D;
    public static final acc a;
    public static final acc b;
    public static final acc c;
    public static final acc d;
    public static final acc e;
    public static final acc f;

    /* JADX WARN: Type inference failed for: r0v0, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [acc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [acc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Doctype", 0);
        a = r0;
        ?? r1 = new Enum("StartTag", 1);
        b = r1;
        ?? r2 = new Enum("EndTag", 2);
        c = r2;
        ?? r3 = new Enum("Comment", 3);
        d = r3;
        ?? r4 = new Enum("Character", 4);
        e = r4;
        ?? r5 = new Enum("XmlDecl", 5);
        f = r5;
        ?? r6 = new Enum("EOF", 6);
        C = r6;
        D = new acc[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static acc valueOf(String str) {
        return (acc) Enum.valueOf(acc.class, str);
    }

    public static acc[] values() {
        return (acc[]) D.clone();
    }
}
