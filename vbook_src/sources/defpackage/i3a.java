package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i3a  reason: default package */
/* loaded from: classes.dex */
public final class i3a {
    public static final i3a a;
    public static final i3a b;
    public static final /* synthetic */ i3a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i3a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i3a] */
    static {
        ?? r0 = new Enum("BACKWARD", 0);
        a = r0;
        ?? r1 = new Enum("FORWARD", 1);
        b = r1;
        c = new i3a[]{r0, r1};
    }

    public static i3a valueOf(String str) {
        return (i3a) Enum.valueOf(i3a.class, str);
    }

    public static i3a[] values() {
        return (i3a[]) c.clone();
    }
}
