package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ab  reason: default package */
/* loaded from: classes3.dex */
public final class ab {
    public static final hq7 b;
    public static final ab c;
    public static final ab d;
    public static final /* synthetic */ ab[] e;
    public static final /* synthetic */ qu3 f;
    public final String a;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hq7] */
    static {
        ab abVar = new ab("VITS", "vits", 0);
        c = abVar;
        ab abVar2 = new ab("MATCHA", "matcha", 1);
        ab abVar3 = new ab("KOKORO", "kokoro", 2);
        ab abVar4 = new ab("KITTEN", "kitten", 3);
        ab abVar5 = new ab("SUPERTONIC", "supertonic", 4);
        ab abVar6 = new ab("PIPER", "piper", 5);
        d = abVar6;
        ab[] abVarArr = {abVar, abVar2, abVar3, abVar4, abVar5, abVar6};
        e = abVarArr;
        f = new qu3(abVarArr);
        b = new Object();
    }

    public ab(String str, String str2, int i) {
        this.a = str2;
    }

    public static ab valueOf(String str) {
        return (ab) Enum.valueOf(ab.class, str);
    }

    public static ab[] values() {
        return (ab[]) e.clone();
    }
}
