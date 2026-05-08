// 1. Customer Table
@Entity(tableName = "customers")
data class Customer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val age: Int,
    val gender: String, // "ကျား" or "မ"
    val phone: String,
    val diagnosis: String,
    val createdDate: Long = System.currentTimeMillis()
)

// 2. Product (Purchase) Table
@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val buyPrice: Double,
    val sellPrice: Double,
    val expiryDate: Long, // Epoch Time
    val quantity: Int
)

// 3. Sale & Sale Items (Multi-Cart System)
@Entity(tableName = "sales")
data class Sale(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val customerId: Int,
    val date: Long = System.currentTimeMillis(),
    val serviceFee: Double,
    val totalAmount: Double
)

@Entity(tableName = "sale_items")
data class SaleItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val saleId: Int,
    val productId: Int,
    val quantity: Int,
    val price: Double
)

// 4. Expense Table
@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val amount: Double,
    val deductFrom: String, // "Profit" or "ServiceFee"
    val date: Long = System.currentTimeMillis()
)
