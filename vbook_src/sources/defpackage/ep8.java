package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.pdf.models.FormEditRecord;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep8  reason: default package */
/* loaded from: classes.dex */
public abstract class ep8 extends Binder implements fp8 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int readInt;
        ip8 ip8Var;
        boolean z;
        Object obj;
        int i3;
        String str = fp8.k;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        } else {
            int i4 = 0;
            kq8 kq8Var = null;
            switch (i) {
                case 1:
                    int x = ((hp8) this).x((ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(x);
                    return true;
                case 2:
                    int s = ((hp8) this).s();
                    parcel2.writeNoException();
                    parcel2.writeInt(s);
                    return true;
                case 3:
                    b73 F = ((hp8) this).F(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(F, 1);
                    return true;
                case 4:
                    Bitmap A = ((hp8) this).A(parcel.readInt(), parcel.readInt(), parcel.readInt(), (yn9) parcel.readTypedObject(yn9.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(A, 1);
                    return true;
                case 5:
                    Bitmap K = ((hp8) this).K(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (yn9) parcel.readTypedObject(yn9.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(K, 1);
                    return true;
                case 6:
                    readInt = parcel.readInt();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List r0 = kq8Var.r0();
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, r0);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 7:
                    readInt = parcel.readInt();
                    String readString = parcel.readString();
                    readString.getClass();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List y = kq8Var.y(readString);
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, y);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 8:
                    int readInt2 = parcel.readInt();
                    Parcelable.Creator creator = SelectionBoundary.CREATOR;
                    PageSelection m = ((hp8) this).m(readInt2, cp8.e(parcel.readTypedObject(creator)), cp8.e(parcel.readTypedObject(creator)));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(m, 1);
                    return true;
                case 9:
                    readInt = parcel.readInt();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List j1 = kq8Var.j1();
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, j1);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 10:
                    readInt = parcel.readInt();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List R = kq8Var.R();
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, R);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 11:
                    readInt = parcel.readInt();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List e0 = kq8Var.e0();
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, e0);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 12:
                    int h = ((hp8) this).h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h);
                    return true;
                case 13:
                    ((hp8) this).M(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    ((hp8) this).E();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    readInt = parcel.readInt();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List X = kq8Var.X();
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, X);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 16:
                    readInt = parcel.readInt();
                    int[] createIntArray = parcel.createIntArray();
                    createIntArray.getClass();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List X0 = kq8Var.X0(createIntArray);
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, X0);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 17:
                    readInt = parcel.readInt();
                    FormEditRecord formEditRecord = (FormEditRecord) parcel.readTypedObject(FormEditRecord.CREATOR);
                    formEditRecord.getClass();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            kq8Var.getClass();
                            List G0 = kq8Var.G0(formEditRecord);
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            vye.c(parcel2, G0);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 18:
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hp8 hp8Var = (hp8) this;
                    parcelFileDescriptor.getClass();
                    try {
                        ip8 ip8Var2 = hp8Var.c;
                        if (ip8Var2 != null) {
                            ip8Var2.A(parcelFileDescriptor, z);
                            parcel2.writeNoException();
                            return true;
                        }
                        c16.w("rendererAdapter");
                        throw null;
                    } catch (Exception e) {
                        fb4.l(e);
                        return false;
                    }
                case 19:
                    int readInt3 = parcel.readInt();
                    hp8 hp8Var2 = (hp8) this;
                    kj kjVar = hp8Var2.e;
                    if (kjVar == null || kjVar.a != readInt3) {
                        ip8 ip8Var3 = hp8Var2.c;
                        if (ip8Var3 != null) {
                            hp8Var2.e = new kj(readInt3, new yh8(ip8Var3, 0));
                        } else {
                            c16.w("rendererAdapter");
                            throw null;
                        }
                    }
                    kj kjVar2 = hp8Var2.e;
                    kjVar2.getClass();
                    uk8 r = kjVar2.r(0);
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(r, 1);
                    return true;
                case 20:
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    hp8 hp8Var3 = (hp8) this;
                    kj kjVar3 = hp8Var3.e;
                    if (kjVar3 == null || kjVar3.a != readInt4) {
                        ip8 ip8Var4 = hp8Var3.c;
                        if (ip8Var4 != null) {
                            hp8Var3.e = new kj(readInt4, new yh8(ip8Var4, 0));
                        } else {
                            c16.w("rendererAdapter");
                            throw null;
                        }
                    }
                    kj kjVar4 = hp8Var3.e;
                    kjVar4.getClass();
                    uk8 r2 = kjVar4.r(readInt5);
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(r2, 1);
                    return true;
                case 21:
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(wg3.CREATOR);
                    createTypedArrayList.getClass();
                    yh8 yh8Var = ((hp8) this).d;
                    if (yh8Var != null) {
                        ip8 ip8Var5 = yh8Var.a;
                        ArrayList arrayList = new ArrayList();
                        int i5 = -1;
                        try {
                            try {
                                int size = createTypedArrayList.size();
                                kq8 kq8Var2 = null;
                                int i6 = -1;
                                int i7 = 0;
                                while (i7 < size) {
                                    try {
                                        Object obj2 = createTypedArrayList.get(i7);
                                        i7++;
                                        wg3 wg3Var = (wg3) obj2;
                                        if (wg3Var instanceof zw5) {
                                            i3 = ((zw5) wg3Var).a.a;
                                        } else if (wg3Var instanceof uxc) {
                                            i3 = ((uxc) wg3Var).b.a;
                                        } else if (wg3Var instanceof un9) {
                                            i3 = ((un9) wg3Var).b;
                                        } else {
                                            i3 = -1;
                                        }
                                        if (i3 != -1) {
                                            if (kq8Var2 == null || i6 != i3) {
                                                if (kq8Var2 != null) {
                                                    ip8Var5.U(i6, kq8Var2);
                                                }
                                                kq8Var2 = ip8Var5.F(i3, true);
                                                try {
                                                    kq8Var2.Y0();
                                                    i6 = i3;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    kq8Var = kq8Var2;
                                                    i5 = i3;
                                                    String message = e.getMessage();
                                                    if (message == null) {
                                                        message = "Unknown error";
                                                    }
                                                    xg3 xg3Var = new xg3(i4, message, arrayList);
                                                    if (kq8Var != null) {
                                                        ip8Var5.U(i5, kq8Var);
                                                    }
                                                    obj = xg3Var;
                                                    parcel2.writeNoException();
                                                    parcel2.writeTypedObject(obj, 1);
                                                    return true;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    kq8Var = kq8Var2;
                                                    i5 = i3;
                                                    if (kq8Var != null) {
                                                        ip8Var5.U(i5, kq8Var);
                                                    }
                                                    throw th;
                                                }
                                            }
                                            arrayList.add(yh8.b(kq8Var2, wg3Var));
                                            i4++;
                                        } else {
                                            throw new Exception("Invalid page index");
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        kq8Var = kq8Var2;
                                        i5 = i6;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        kq8Var = kq8Var2;
                                        i5 = i6;
                                    }
                                }
                                obj = new yg3(arrayList);
                                if (kq8Var2 != null) {
                                    ip8Var5.U(i6, kq8Var2);
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                            parcel2.writeNoException();
                            parcel2.writeTypedObject(obj, 1);
                            return true;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        c16.w("rendererAnnotationsProcessor");
                        throw null;
                    }
                case 22:
                    readInt = parcel.readInt();
                    PointF pointF = (PointF) parcel.readTypedObject(PointF.CREATOR);
                    int[] createIntArray2 = parcel.createIntArray();
                    pointF.getClass();
                    createIntArray2.getClass();
                    ip8Var = ((hp8) this).c;
                    if (ip8Var != null) {
                        try {
                            kq8Var = ip8Var.F(readInt, false);
                            ro5 a2 = hp8.a(pointF, createIntArray2, kq8Var);
                            ip8Var.U(readInt, kq8Var);
                            parcel2.writeNoException();
                            parcel2.writeTypedObject(a2, 1);
                            return true;
                        } finally {
                        }
                    }
                    c16.w("rendererAdapter");
                    throw null;
                case 23:
                    int i8 = ((hp8) this).i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i8);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
