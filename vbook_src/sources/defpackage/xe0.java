package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe0  reason: default package */
/* loaded from: classes.dex */
public final class xe0 {
    public static final xe0 a;
    public static final xe0 b;
    public static final /* synthetic */ xe0[] c;
    /* JADX INFO: Fake field, exist only in values array */
    xe0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [xe0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xe0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xe0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("LEFT", 1);
        a = r1;
        ?? r2 = new Enum("RIGHT", 2);
        b = r2;
        c = new xe0[]{r0, r1, r2};
    }

    public static xe0 valueOf(String str) {
        return (xe0) Enum.valueOf(xe0.class, str);
    }

    public static xe0[] values() {
        return (xe0[]) c.clone();
    }
}
