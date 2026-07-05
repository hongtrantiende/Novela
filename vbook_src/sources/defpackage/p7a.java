package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p7a  reason: default package */
/* loaded from: classes3.dex */
public final class p7a {
    public static final p7a a;
    public static final p7a b;
    public static final p7a c;
    public static final /* synthetic */ p7a[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p7a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p7a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p7a] */
    static {
        ?? r0 = new Enum("Idle", 0);
        a = r0;
        ?? r1 = new Enum("Dragging", 1);
        b = r1;
        ?? r2 = new Enum("End", 2);
        c = r2;
        d = new p7a[]{r0, r1, r2};
    }

    public static p7a valueOf(String str) {
        return (p7a) Enum.valueOf(p7a.class, str);
    }

    public static p7a[] values() {
        return (p7a[]) d.clone();
    }
}
