package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc3  reason: default package */
/* loaded from: classes.dex */
public final class rc3 {
    public static final rc3 a;
    public static final rc3 b;
    public static final /* synthetic */ rc3[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [rc3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rc3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("html", 0);
        a = r0;
        ?? r1 = new Enum("xml", 1);
        b = r1;
        c = new rc3[]{r0, r1};
    }

    public static rc3 valueOf(String str) {
        return (rc3) Enum.valueOf(rc3.class, str);
    }

    public static rc3[] values() {
        return (rc3[]) c.clone();
    }
}
