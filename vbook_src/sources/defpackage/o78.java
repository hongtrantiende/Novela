package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o78  reason: default package */
/* loaded from: classes.dex */
public final class o78 {
    public static final o78 a;
    public static final o78 b;
    public static final o78 c;
    public static final /* synthetic */ o78[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [o78, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o78, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o78, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NO_OP", 0);
        a = r0;
        ?? r1 = new Enum("ADD", 1);
        b = r1;
        ?? r2 = new Enum("REMOVE", 2);
        c = r2;
        d = new o78[]{r0, r1, r2};
    }

    public static o78 valueOf(String str) {
        return (o78) Enum.valueOf(o78.class, str);
    }

    public static o78[] values() {
        return (o78[]) d.clone();
    }
}
