package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o00  reason: default package */
/* loaded from: classes.dex */
public final class o00 implements rb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ o00(int i) {
        this.a = i;
    }

    @Override // defpackage.rb4
    public final sb4 a(Object obj, xe8 xe8Var, io5 io5Var) {
        switch (this.a) {
            case 0:
                lyc lycVar = (lyc) obj;
                Bitmap.Config[] configArr = n2d.a;
                if (!c16.i(lycVar.c, "file") || !c16.i(sl1.e0(ade.u(lycVar)), "android_asset")) {
                    return null;
                }
                return new p00(lycVar, xe8Var, 0);
            case 1:
                throw s21.i(obj);
            case 2:
                return new pl0((Bitmap) obj);
            case 3:
                return new n01((byte[]) obj, xe8Var, 0);
            case 4:
                return new n01((ByteBuffer) obj, xe8Var, 1);
            case 5:
                lyc lycVar2 = (lyc) obj;
                if (!c16.i(lycVar2.c, "content")) {
                    return null;
                }
                return new i32(lycVar2, xe8Var);
            case 6:
                lyc lycVar3 = (lyc) obj;
                if (!c16.i(lycVar3.c, "data")) {
                    return null;
                }
                return new p00(lycVar3, xe8Var, 1);
            case 7:
                return new n01((Drawable) obj, xe8Var, 2);
            case 8:
                throw s21.i(obj);
            case 9:
                lyc lycVar4 = (lyc) obj;
                String str = lycVar4.c;
                if ((str != null && !str.equals("file")) || lycVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = n2d.a;
                if (c16.i(lycVar4.c, "file") && c16.i(sl1.e0(ade.u(lycVar4)), "android_asset")) {
                    return null;
                }
                return new p00(lycVar4, xe8Var, 2);
            case 10:
                lyc lycVar5 = (lyc) obj;
                if (!c16.i(lycVar5.c, "jar:file")) {
                    return null;
                }
                return new p00(lycVar5, xe8Var, 3);
            case 11:
                f76 f76Var = (f76) obj;
                f76Var.getClass();
                xe8Var.getClass();
                io5Var.getClass();
                return new h76(f76Var, 0);
            case 12:
                zq9 zq9Var = (zq9) obj;
                zq9Var.getClass();
                xe8Var.getClass();
                io5Var.getClass();
                return new pl0(zq9Var);
            case 13:
                lyc lycVar6 = (lyc) obj;
                if (!c16.i(lycVar6.c, "android.resource")) {
                    return null;
                }
                return new p00(lycVar6, xe8Var, 4);
            default:
                f76 f76Var2 = (f76) obj;
                f76Var2.getClass();
                xe8Var.getClass();
                io5Var.getClass();
                return new h76(f76Var2, 1);
        }
    }
}
