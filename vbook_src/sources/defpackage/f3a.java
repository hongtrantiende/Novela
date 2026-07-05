package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f3a  reason: default package */
/* loaded from: classes3.dex */
public final class f3a {
    public static final f3a a;
    public static final f3a b;
    public static final /* synthetic */ f3a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f3a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f3a] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("End", 1);
        b = r1;
        c = new f3a[]{r0, r1};
    }

    public static f3a valueOf(String str) {
        return (f3a) Enum.valueOf(f3a.class, str);
    }

    public static f3a[] values() {
        return (f3a[]) c.clone();
    }
}
