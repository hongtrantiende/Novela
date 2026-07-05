package defpackage;

import com.reader.piper.PiperNcnn;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aw8  reason: default package */
/* loaded from: classes.dex */
public final class aw8 extends aab implements lu4 {
    public final /* synthetic */ s26 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw8(s26 s26Var, String str, String str2, float f, float f2, m42 m42Var) {
        super(2, m42Var);
        this.a = s26Var;
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new aw8(this.a, this.b, this.c, this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((aw8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        return Boolean.valueOf(((PiperNcnn) this.a.b).loadModelEncrypted(this.b, this.c, this.d, this.e, 0));
    }
}
