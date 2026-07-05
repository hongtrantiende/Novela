package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tfb  reason: default package */
/* loaded from: classes3.dex */
public final class tfb {
    public static final tfb a;
    public static final tfb b;
    public static final tfb c;
    public static final /* synthetic */ tfb[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [tfb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tfb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tfb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("All", 0);
        a = r0;
        ?? r1 = new Enum("StatusBars", 1);
        b = r1;
        ?? r2 = new Enum("NavigationBars", 2);
        c = r2;
        d = new tfb[]{r0, r1, r2};
    }

    public static tfb valueOf(String str) {
        return (tfb) Enum.valueOf(tfb.class, str);
    }

    public static tfb[] values() {
        return (tfb[]) d.clone();
    }
}
