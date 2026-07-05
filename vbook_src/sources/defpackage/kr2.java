package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kr2  reason: default package */
/* loaded from: classes.dex */
public final class kr2 {
    public static final kr2 a;
    public static final kr2 b;
    public static final /* synthetic */ kr2[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kr2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kr2] */
    static {
        ?? r0 = new Enum("View", 0);
        a = r0;
        ?? r1 = new Enum("Send", 1);
        b = r1;
        c = new kr2[]{r0, r1};
    }

    public static kr2 valueOf(String str) {
        return (kr2) Enum.valueOf(kr2.class, str);
    }

    public static kr2[] values() {
        return (kr2[]) c.clone();
    }
}
