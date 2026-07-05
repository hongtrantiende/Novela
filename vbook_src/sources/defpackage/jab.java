package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jab  reason: default package */
/* loaded from: classes.dex */
public final class jab {
    public static final jab a;
    public static final jab b;
    public static final jab c;
    public static final /* synthetic */ jab[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jab] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jab] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jab] */
    static {
        ?? r0 = new Enum("StartToEnd", 0);
        a = r0;
        ?? r1 = new Enum("EndToStart", 1);
        b = r1;
        ?? r2 = new Enum("Both", 2);
        c = r2;
        d = new jab[]{r0, r1, r2};
    }

    public static jab valueOf(String str) {
        return (jab) Enum.valueOf(jab.class, str);
    }

    public static jab[] values() {
        return (jab[]) d.clone();
    }
}
