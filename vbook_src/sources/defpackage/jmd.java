package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jmd  reason: default package */
/* loaded from: classes.dex */
public final class jmd {
    public static final /* synthetic */ jmd[] C;
    public static final jmd a;
    public static final jmd b;
    public static final jmd c;
    public static final jmd d;
    public static final jmd e;
    public static final jmd f;

    /* JADX WARN: Type inference failed for: r0v0, types: [jmd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jmd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jmd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [jmd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [jmd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [jmd, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ENQUEUED", 0);
        a = r0;
        ?? r1 = new Enum("RUNNING", 1);
        b = r1;
        ?? r2 = new Enum("SUCCEEDED", 2);
        c = r2;
        ?? r3 = new Enum("FAILED", 3);
        d = r3;
        ?? r4 = new Enum("BLOCKED", 4);
        e = r4;
        ?? r5 = new Enum("CANCELLED", 5);
        f = r5;
        C = new jmd[]{r0, r1, r2, r3, r4, r5};
    }

    public static jmd valueOf(String str) {
        return (jmd) Enum.valueOf(jmd.class, str);
    }

    public static jmd[] values() {
        return (jmd[]) C.clone();
    }

    public final boolean a() {
        if (this != c && this != d && this != f) {
            return false;
        }
        return true;
    }
}
