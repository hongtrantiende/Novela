package defpackage;

import android.graphics.Bitmap;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dp8  reason: default package */
/* loaded from: classes.dex */
public final class dp8 implements fp8 {
    public IBinder a;

    @Override // defpackage.fp8
    public final Bitmap A(int i, int i2, int i3, yn9 yn9Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeTypedObject(yn9Var, 0);
            if (this.a.transact(4, obtain, obtain2, 0)) {
                obtain2.readException();
                return (Bitmap) obtain2.readTypedObject(Bitmap.CREATOR);
            }
            throw new RemoteException("Method getPageBitmap is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final void E() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            if (this.a.transact(14, obtain, obtain2, 0)) {
                obtain2.readException();
                return;
            }
            throw new RemoteException("Method closePdfDocument is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final b73 F(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeInt(i);
            if (this.a.transact(3, obtain, obtain2, 0)) {
                obtain2.readException();
                return (b73) obtain2.readTypedObject(b73.CREATOR);
            }
            throw new RemoteException("Method getPageDimensions is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final Bitmap K(int i, int i2, int i3, int i4, int i5, int i6, int i7, yn9 yn9Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            obtain.writeInt(i6);
            obtain.writeInt(i7);
            obtain.writeTypedObject(yn9Var, 0);
            if (this.a.transact(5, obtain, obtain2, 0)) {
                obtain2.readException();
                return (Bitmap) obtain2.readTypedObject(Bitmap.CREATOR);
            }
            throw new RemoteException("Method getTileBitmap is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final void M(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeInt(i);
            if (this.a.transact(13, obtain, obtain2, 0)) {
                obtain2.readException();
                return;
            }
            throw new RemoteException("Method releasePage is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.fp8
    public final int h() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            if (this.a.transact(12, obtain, obtain2, 0)) {
                obtain2.readException();
                return obtain2.readInt();
            }
            throw new RemoteException("Method getFormType is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final int i() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            if (this.a.transact(23, obtain, obtain2, 0)) {
                obtain2.readException();
                return obtain2.readInt();
            }
            throw new RemoteException("Method getLinearizationStatus is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final PageSelection m(int i, SelectionBoundary selectionBoundary, SelectionBoundary selectionBoundary2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeInt(i);
            obtain.writeTypedObject(selectionBoundary, 0);
            obtain.writeTypedObject(selectionBoundary2, 0);
            if (this.a.transact(8, obtain, obtain2, 0)) {
                obtain2.readException();
                return (PageSelection) obtain2.readTypedObject(PageSelection.CREATOR);
            }
            throw new RemoteException("Method selectPageText is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final int s() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            if (this.a.transact(2, obtain, obtain2, 0)) {
                obtain2.readException();
                return obtain2.readInt();
            }
            throw new RemoteException("Method numPages is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.fp8
    public final int x(ParcelFileDescriptor parcelFileDescriptor, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(fp8.k);
            obtain.writeTypedObject(parcelFileDescriptor, 0);
            obtain.writeString(str);
            if (this.a.transact(1, obtain, obtain2, 0)) {
                obtain2.readException();
                return obtain2.readInt();
            }
            throw new RemoteException("Method openPdfDocument is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
