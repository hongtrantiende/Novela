package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hkf  reason: default package */
/* loaded from: classes.dex */
public final class hkf {
    public static final hkf a;
    public static final hkf b;
    public static final hkf c;
    public static final /* synthetic */ hkf[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [hkf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hkf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hkf, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNCOMPRESSED", 0);
        a = r0;
        ?? r1 = new Enum("COMPRESSED", 1);
        b = r1;
        ?? r2 = new Enum("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        c = r2;
        d = new hkf[]{r0, r1, r2};
    }

    public static hkf[] values() {
        return (hkf[]) d.clone();
    }
}
