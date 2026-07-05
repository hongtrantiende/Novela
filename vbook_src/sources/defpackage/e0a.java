package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e0a  reason: default package */
/* loaded from: classes.dex */
public final class e0a {
    public static final e0a a;
    public static final e0a b;
    public static final e0a c;
    public static final /* synthetic */ e0a[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e0a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e0a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e0a] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        a = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        b = r1;
        ?? r2 = new Enum("DEVICE_CHARGING", 2);
        c = r2;
        d = new e0a[]{r0, r1, r2};
    }

    public static e0a valueOf(String str) {
        return (e0a) Enum.valueOf(e0a.class, str);
    }

    public static e0a[] values() {
        return (e0a[]) d.clone();
    }
}
