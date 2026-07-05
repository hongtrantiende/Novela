package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qcc  reason: default package */
/* loaded from: classes3.dex */
public final class qcc {
    public static final qcc C;
    public static final qcc D;
    public static final qcc E;
    public static final /* synthetic */ qcc[] F;
    public static final qcc a;
    public static final qcc b;
    public static final qcc c;
    public static final qcc d;
    public static final qcc e;
    public static final qcc f;

    /* JADX WARN: Type inference failed for: r0v0, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [qcc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v2, types: [qcc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("KEYWORD", 0);
        a = r0;
        ?? r1 = new Enum("STRING", 1);
        b = r1;
        ?? r2 = new Enum("COMMENT", 2);
        c = r2;
        ?? r3 = new Enum("NUMBER", 3);
        d = r3;
        ?? r4 = new Enum("FUNCTION", 4);
        e = r4;
        ?? r5 = new Enum("TYPE", 5);
        f = r5;
        ?? r6 = new Enum("VARIABLE", 6);
        C = r6;
        ?? r7 = new Enum("OPERATOR", 7);
        D = r7;
        ?? r8 = new Enum("PUNCTUATION", 8);
        ?? r9 = new Enum("WHITESPACE", 9);
        E = r9;
        F = new qcc[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    public static qcc valueOf(String str) {
        return (qcc) Enum.valueOf(qcc.class, str);
    }

    public static qcc[] values() {
        return (qcc[]) F.clone();
    }
}
