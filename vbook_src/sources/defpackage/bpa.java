package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bpa  reason: default package */
/* loaded from: classes3.dex */
public final class bpa {
    public static final bpa a;
    public static final /* synthetic */ bpa[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [bpa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bpa, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RemoveBeforeExecute", 0);
        a = r0;
        b = new bpa[]{r0, new Enum("KeepText", 1)};
    }

    public static bpa valueOf(String str) {
        return (bpa) Enum.valueOf(bpa.class, str);
    }

    public static bpa[] values() {
        return (bpa[]) b.clone();
    }
}
