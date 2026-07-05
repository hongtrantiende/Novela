package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rbc  reason: default package */
/* loaded from: classes.dex */
public final class rbc {
    public static final rbc a;
    public static final rbc b;
    public static final rbc c;
    public static final /* synthetic */ rbc[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [rbc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rbc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rbc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("On", 0);
        a = r0;
        ?? r1 = new Enum("Off", 1);
        b = r1;
        ?? r2 = new Enum("Indeterminate", 2);
        c = r2;
        d = new rbc[]{r0, r1, r2};
    }

    public static rbc valueOf(String str) {
        return (rbc) Enum.valueOf(rbc.class, str);
    }

    public static rbc[] values() {
        return (rbc[]) d.clone();
    }
}
