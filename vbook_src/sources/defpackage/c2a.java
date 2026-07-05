package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c2a  reason: default package */
/* loaded from: classes.dex */
public final class c2a {
    public static final c2a a;
    public static final /* synthetic */ c2a[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [c2a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c2a, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SWAP", 0);
        a = r0;
        b = new c2a[]{r0, new Enum("INSERT", 1)};
    }

    public static c2a valueOf(String str) {
        return (c2a) Enum.valueOf(c2a.class, str);
    }

    public static c2a[] values() {
        return (c2a[]) b.clone();
    }
}
