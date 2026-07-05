package defpackage;

import android.content.Context;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: it0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class it0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ it0(boolean z, Object obj, float f, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = f;
        this.e = obj2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        float intBitsToFloat;
        float e;
        boolean z;
        int i;
        int i2;
        int i3 = this.a;
        Object obj3 = this.e;
        float f = this.c;
        Object obj4 = this.d;
        boolean z2 = this.b;
        switch (i3) {
            case 0:
                ef2 ef2Var = (ef2) obj4;
                yya yyaVar = (yya) obj3;
                dna dnaVar = (dna) obj;
                y78 y78Var = (y78) obj2;
                if (z2) {
                    intBitsToFloat = (ef2Var.c() + 0.5f) * f;
                    e = pt0.e(yyaVar);
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (dnaVar.a >> 32)) - ((ef2Var.c() + 0.5f) * f);
                    e = pt0.e(yyaVar);
                }
                float f2 = e + intBitsToFloat;
                return new y78((Float.floatToRawIntBits(Float.intBitsToFloat((int) (dnaVar.a & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            default:
                Context context = (Context) obj4;
                nm1 nm1Var = (nm1) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (z2) {
                        i = R.drawable.ic_pause;
                    } else {
                        i = R.drawable.ic_play_arrow;
                    }
                    il ilVar = new il(i);
                    if (z2) {
                        i2 = R.string.widget_pause;
                    } else {
                        i2 = R.string.widget_play;
                    }
                    xwe.b(ilVar, context.getString(i2), s9e.w(f), 0, new dm1(new mac(nm1Var)), rv4Var, 32768, 8);
                } else {
                    rv4Var.X();
                }
                return pvc.a;
        }
    }
}
