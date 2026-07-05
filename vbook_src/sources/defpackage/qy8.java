package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qy8  reason: default package */
/* loaded from: classes.dex */
public final class qy8 {
    public static final qy8 a;
    public static final qy8 b;
    public static final qy8 c;
    public static final /* synthetic */ qy8[] d;
    /* JADX INFO: Fake field, exist only in values array */
    qy8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [qy8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qy8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qy8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qy8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        ?? r1 = new Enum("BUFFERING", 1);
        a = r1;
        ?? r2 = new Enum("READY", 2);
        b = r2;
        ?? r3 = new Enum("END", 3);
        c = r3;
        d = new qy8[]{r0, r1, r2, r3};
    }

    public static qy8 valueOf(String str) {
        return (qy8) Enum.valueOf(qy8.class, str);
    }

    public static qy8[] values() {
        return (qy8[]) d.clone();
    }
}
