package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d92  reason: default package */
/* loaded from: classes3.dex */
public final class d92 {
    public static final d92 a;
    public static final d92 b;
    public static final /* synthetic */ d92[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d92] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d92] */
    static {
        ?? r0 = new Enum("Rethrow", 0);
        a = r0;
        ?? r1 = new Enum("ContainAndReport", 1);
        b = r1;
        c = new d92[]{r0, r1};
    }

    public static d92 valueOf(String str) {
        return (d92) Enum.valueOf(d92.class, str);
    }

    public static d92[] values() {
        return (d92[]) c.clone();
    }
}
