package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce9  reason: default package */
/* loaded from: classes3.dex */
public final class ce9 {
    public static final ce9 a;
    public static final ce9 b;
    public static final /* synthetic */ ce9[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ce9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ce9] */
    static {
        ?? r0 = new Enum("CaseSensitive", 0);
        a = r0;
        ?? r1 = new Enum("Regex", 1);
        b = r1;
        c = new ce9[]{r0, r1};
    }

    public static ce9 valueOf(String str) {
        return (ce9) Enum.valueOf(ce9.class, str);
    }

    public static ce9[] values() {
        return (ce9[]) c.clone();
    }
}
