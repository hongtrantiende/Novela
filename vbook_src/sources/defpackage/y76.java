package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y76  reason: default package */
/* loaded from: classes3.dex */
public final class y76 {
    public static final y76 a;
    public static final /* synthetic */ y76[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y76] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y76] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y76] */
    static {
        ?? r0 = new Enum("INVARIANT", 0);
        a = r0;
        b = new y76[]{r0, new Enum("IN", 1), new Enum("OUT", 2)};
    }

    public static y76 valueOf(String str) {
        return (y76) Enum.valueOf(y76.class, str);
    }

    public static y76[] values() {
        return (y76[]) b.clone();
    }
}
