package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fid  reason: default package */
/* loaded from: classes3.dex */
public final class fid {
    public static final v28 a;
    public static final /* synthetic */ fid[] b;
    public static final /* synthetic */ qu3 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [fid, java.lang.Enum] */
    static {
        fid[] fidVarArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        b = fidVarArr;
        c = new qu3(fidVarArr);
        a = new v28(8);
    }

    public static fid valueOf(String str) {
        return (fid) Enum.valueOf(fid.class, str);
    }

    public static fid[] values() {
        return (fid[]) b.clone();
    }
}
